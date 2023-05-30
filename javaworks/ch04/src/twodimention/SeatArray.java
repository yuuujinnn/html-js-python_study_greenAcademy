package twodimention;

import java.util.Scanner;

public class SeatArray {

   public static void main(String[] args) {
      try (// 입장객 수에 따른 열과 줄수 계산하기
      Scanner sc = new Scanner(System.in)) {
         int customer; //입장객 수 저장
         int colNum = 0;   //좌석 열 수 저장
         int rowNum = 0;   //줄(행)의 수 저장
         

         
         System.out.print("입장객 수 입력 : ");
         customer = sc.nextInt();
         
         System.out.print("좌석 열 수 입력 : ");
         colNum = sc.nextInt();
         
         //연산 처리(조건문) - 나누어 떨어지는 경우, 줄수에 1을 더하는 경우
         if(customer % colNum == 0) {
            rowNum = customer / colNum;  //나누는 몫
         }else {
            rowNum = (int)(customer / colNum) + 1;  //몫 + 1
            // rowNum = customer / colNum + 1;  //몫 + 1
         }
         
         // 자리 배치할 배열 공간 생성
         int[][] arr = new int[rowNum][colNum];
         
         for(int i=0; i<rowNum; i++) {
            for(int j=0; j<colNum; j++) {
               // 열의 종료값 x 행의 값 + 열의 값
               arr[i][j] = (colNum*i)+(j+1);  
               if(customer < arr[i][j])
                  break;
               System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            
            
            
         }
      }
   }
   
   
}