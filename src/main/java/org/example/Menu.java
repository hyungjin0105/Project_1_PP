package org.example;
import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    WordCRUD wordCrud;

    public Menu() {
        wordCrud = new WordCRUD(input);
    }

    public int selectMenu(){
            System.out.println("*** 영단어 마스터 ***\n");
            System.out.print("********************\n" +
                    "1. 모든 단어 보기\n" +
                    "2. 수준별 단어 보기\n" +
                    "3. 단어 검색\n" +
                    "4. 단어 추가\n" +
                    "5. 단어 수정\n" +
                    "6. 단어 삭제\n" +
                    "7. 파일 저장\n" +
                    "0. 나가기\n" +
                    "********************\n" +
                    "=> 원하는 메뉴는?" );

            return input.nextInt();
    }
    public void start() {
        wordCrud.loadFile();
        while(true){
            int menu = selectMenu();
            if(menu == 0) break;
            if(menu == 4) {
                wordCrud.addWord();
            }
            else if(menu == 1){
                wordCrud.listAll();
            }
            else if(menu == 2){
                wordCrud.searchLevel();
            }
            else if(menu == 3){
                wordCrud.searchWord();
            }
            else if(menu == 5){
                wordCrud.update();
            }
            else if(menu == 6){
                wordCrud.delete();
            }
            else if(menu == 7){
                wordCrud.saveFile();
            }
            System.out.println(menu);
        }


    }
}
