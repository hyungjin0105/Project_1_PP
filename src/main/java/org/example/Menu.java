package org.example;
import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    public void start() {

        int menuNum = 9;

        while(menuNum != 0) {
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
            menuNum = input.nextInt();

            if(menuNum == 1){
                // display list needs to be done
            }
            if(menuNum == 4){
                //adding vocabs needs to be done
            }
        }


    }
}
