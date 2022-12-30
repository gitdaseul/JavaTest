package com.gitdaeul.javagame;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void CharacterList() {
        PlayerCharacterList player1 = new PlayerCharacterList();
        player1.playerName = "플레이어 1";
        player1.playerLevel = 10;
        player1.playerJob = "제로";

        PlayerCharacterList player2 = new PlayerCharacterList();

        player2.playerName = "플레이어 2";
        player2.playerLevel = 20;
        player2.playerJob = "엔젤릭버스터";

        PlayerCharacterList player3 = new PlayerCharacterList();
        player3.playerName = "플레이어 3";
        player3.playerLevel = 30;
        player3.playerJob = "다크나이트";
        Scanner inp = new Scanner(System.in);
        System.out.println("Search Mode 에 진입했습니다 종료하시려면 exit를 입력해주세요");
        var inputval = inp.next();

        if (Objects.equals(inputval, "player1")) {
            System.out.println(player1.playerName);
            System.out.println(player1.playerLevel);
            System.out.println(player1.playerJob);

            CharacterList();

        } else if (Objects.equals(inputval, "player2")) {
            System.out.println(player2.playerName);
            System.out.println(player2.playerLevel);
            System.out.println(player2.playerJob);

            CharacterList();

        } else if (Objects.equals(inputval, "player3")) {
            System.out.println(player3.playerName);
            System.out.println(player3.playerLevel);
            System.out.println(player3.playerJob);

            CharacterList();

        } else if (Objects.equals(inputval, "exit")){
            System.out.println("Search Mode Quit");

            GamePlaySetingsM();

        } else {
            System.out.println("올바른 닉네임을 입력해주세요");

            CharacterList();
        }
    }

    public static void GamePlaySetingsM() {
        GamePlaySetting start = new GamePlaySetting();
        GamePlaySetting end = new GamePlaySetting();
        Scanner inp = new Scanner(System.in);

        System.out.println("게임을 시작하시겠습니까?");
        var startinputval = inp.next();

        if (Objects.equals(startinputval, "Start")){
            start.info = "Start";
            System.out.println("접속할 캐릭터를 입력해주세요");
            var inputval = inp.next();
                if (Objects.equals(inputval, "player1")){
                    System.out.println("플레이어 1로 접속합니다");
                    start.PlayingCharacterName = "플레이어 1";
                    System.out.println("현제 접속하신 캐릭터는 " + start.PlayingCharacterName + "입니다");

                } else if (Objects.equals(inputval, "player2")) {
                    System.out.println("플레이어 2로 접속합니다");
                    start.PlayingCharacterName = "플레이어 2";
                    System.out.println("현제 접속하신 캐릭터는 " + start.PlayingCharacterName + "입니다");

                } else if (Objects.equals(inputval, "player3")) {
                    System.out.println("플레이어 3로 접속합니다");
                    start.PlayingCharacterName = "플레이어 3";System.out.println("현제 접속하신 캐릭터는 " + start.PlayingCharacterName + "입니다");

                } else {
                    System.out.println("생성된 캐릭터인지 Search Mode 에서 확인해주세요");
                    CharacterList();
                }
        } else if (Objects.equals(startinputval, "Exit")){
            end.info = "Quit";
            System.out.println("종료합니다.");
        } else {
            System.out.println("다시시도 하세요");
            GamePlaySetingsM();
        }



    }

    public static void main(String[] args) {
        CharacterList();
        GamePlaySetingsM();
    }
}
