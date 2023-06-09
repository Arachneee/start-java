package chapter15;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
class Exercise15_9 extends Frame {
    String fileName;
    TextArea content;
    MenuBar mb;
    Menu mFile;
    MenuItem miNew, miOpen, miSaveAs, miExit;
    Exercise15_9(String title) {
        super(title);
        content = new TextArea();
        add(content);
        mb = new MenuBar();
        mFile = new Menu("File");
        miNew = new MenuItem("New");
        miOpen = new MenuItem("Open");
        miSaveAs = new MenuItem("Save As...");
        miExit = new MenuItem("Exit");
        mFile.add(miNew);
        mFile.add(miOpen);
        mFile.add(miSaveAs);
        mFile.addSeparator(); // (separator) . 메뉴 분리선 을 넣는다
        mFile.add(miExit);
        mb.add(mFile); // MenuBar Menu . 에 를 추가한다
        setMenuBar(mb); // Frame MenuBar . 에 를 포함시킨다
// . 메뉴에 이벤트 핸들러를 등록한다
        MyHandler handler = new MyHandler();
        miNew.addActionListener(handler);
        miOpen.addActionListener(handler);
        miSaveAs.addActionListener(handler);
        miExit.addActionListener(handler);
        setSize(300, 200);
        setVisible(true);
    }
    // TextArea 선택된 파일의 내용을 읽어서 에 보여주는 메서드
    void fileOpen(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            StringWriter sw = new StringWriter();
            String line = "";
            try{
                while((line = br.readLine()) != null){
                    sw.write(line);
                    sw.write('\n');
                }
                content.setText(sw.toString());
            } catch (IOException e){
                System.exit(0);
            } finally {
                br.close();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
/*
(1) . 아래의 로직에 맞게 코드를 작성하시오
1. BuffredReader FileReader . 와 를 이용해서 지정된 파일을 읽는다
2. StringWriter . 에 출력한다
3. StringWriter content(TextArea) . 의 내용을 에 보여준다
*/
    }
    void saveAs(String fileName) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(content.getText());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
/*
(2) . 아래의 로직에 맞게 코드를 작성하시오
1. BuffredWriter FileWriter . 와 를 생성한다
2. content BufferedWriter . 에 있는 내용을 가져와서 에 출력한다
3. BufferedWriter . 를 닫는다
*/
    } // saveAs메서드의 끝
    public static void main(String args[]) {
        Exercise15_9 mainWin = new Exercise15_9("Text Editor");
    } // main메서드의 끝
    // 메뉴를 클릭했을 때 메뉴별 처리코드
    class MyHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if(command.equals("New")) {
                content.setText("");
            } else if(command.equals("Open")) {
                FileDialog fileOpen = new FileDialog(Exercise15_9.this,
                        "파일열기");
                fileOpen.setVisible(true);
                fileName = fileOpen.getDirectory() + fileOpen.getFile();
                System.out.println(fileName);
// TextArea . 선택된 파일의 내용을 에 보여준다
                fileOpen(fileName);
            } else if(command.equals("Save As...")) {
                FileDialog fileSave = new FileDialog(Exercise15_9.this,
                        "파일저장",FileDialog.SAVE);
                fileSave.setVisible(true);
                fileName = fileSave.getDirectory() + fileSave.getFile();
                System.out.println(fileName);
// TextArea . 현재 의 내용을 선택된 파일에 저장한다
                saveAs(fileName);
            } else if(command.equals("Exit")) {
                System.exit(0); // . 프로그램을 종료시킨다
            }
        }
    } // class MyHandler
}