package chapter15;

import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
class WordStudy extends Frame {
    Button first = new Button("<<");
    Button prev = new Button("<");
    Button next = new Button(">");
    Button last = new Button(">>");
    Panel buttons = new Panel();
    TextArea ta = new TextArea();
    ArrayList wordList = new ArrayList();
    final String WORD_FILE = "word_data.txt";
    final String CR_LF = System.getProperty("line.separator");
    int pos = 0;
    WordStudy(String title) {
        super(title);
        buttons.add(first);
        buttons.add(prev);
        buttons.add(next);
        buttons.add(last);
        add("South", buttons);
        add("Center", ta);
        EventHandler handler = new EventHandler();
        addWindowListener(handler);
        first.addActionListener(handler);
        prev.addActionListener(handler);
        next.addActionListener(handler);
        last.addActionListener(handler);
        loadFile(WORD_FILE);
        setBackground(Color.BLACK);
        setSize(300, 200);
        setLocation(200, 200);
        setResizable(true);
        setVisible(true);
        showFirst();
    }
    void showFirst() {
        pos = 0;
        display(pos);
    }
    void showPrevious() {
        pos = (pos > 0) ? --pos : 0;
        display(pos);
    }
    void showNext() {
        int size = wordList.size();
        pos = (pos < size-1) ? ++pos : size-1;
        display(pos);
    }
    void showLast() {
        pos = wordList.size()-1;
        display(pos);
    }
    void display(int pos) {
        StringTokenizer st = new StringTokenizer(wordList.get(pos).toString(),"|");

        StringBuffer sb = new StringBuffer();

        while(st.hasMoreTokens()){
            sb.append(st.nextToken()).append(CR_LF);
        }

        ta.setText(sb.toString());




        // pos . 위치에 있는 라인의 내용을 보여준다
/*
(1) . 아래의 로직에 맞게 코드를 작성하시오
1. wordList pos . 에서 번째의 위치에 있는 데이터를 읽어온다
2. StringTokenizer ‘|’ . 를 이용해서 를 구분자로 자른다
3. Token (CR_LF) StringBuffer .(append) 잘라진 에 개행문자 를 붙여서 에 붙인다
4. StringBuffer TextArea . 의 내용을 뽑아서 에 보여준다
*/
    }
    void loadFile(String fileName) {

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try{
            String line = "";
            while ((line=br.readLine())!=null){
                wordList.add(line);
            }
        }
        catch (IOException e) {
            System.out.println("데이터 파일을 읽을 수 없습니다.");
            System.exit(0);
        }

/*
(2) . 아래의 로직에 맞게 코드를 작성하시오
1. BuffredReader FileReader . 와 를 이용해서 파일의 내용을 라인 단위로 읽는다
2. wordList . 읽어온 라인을 에 저장한다
3. . 만일 예외가 발생하면 프로그램을 종료한다
*/
    }
    public static void main(String args[]) {
        WordStudy mainWin = new WordStudy("Word Study");
    }
    class EventHandler extends WindowAdapter implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            Button b = (Button)ae.getSource();
            if(b==first) {
                showFirst();
            } else if(b==prev) {
                showPrevious();
            } else if(b==next) {
                showNext();
            } else if(b==last) {
                showLast();
            }
        }
        public void windowClosing(WindowEvent e) {System.exit(0);
        }
    } // class EventHandler
}
