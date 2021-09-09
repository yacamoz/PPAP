package tokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class tokenizermain {
	
	public static void menus(Book BookList[]) {
		Scanner sc = new Scanner(System.in);
		int mnum;
		int serpy[]=new int[3];
		int bokpy[]=new int[3];
		String Endbook;
		String Serchbook;
		int endpy[]=new int[3];

	while(true) {
			System.out.print("1.타이틀검색\n2.저자검색\n3.출판사\n4.도서관\n5.출판일\n6.예약대출\n7.종료");
			mnum=sc.nextInt();
			if(mnum==7) {break;}
			switch(mnum) {
			case 1:  {
				System.out.print("책제목:");
				Serchbook=sc.nextLine();
				for(int i=0;i<60;i++) {
					if(BookList[i].getname().contains(Serchbook)) 
						{BookList[i].showinfo();}
				}
		break;}
			case 2: {
				System.out.print("저자입력:");
				Serchbook=sc.nextLine();
				for(int i=0;i<60;i++) {
				if(BookList[i].getauthor().equals(Serchbook)) {
					BookList[i].showinfo();
					}
				}
				break;}
			case 3: {
				System.out.print("출판사 입력:");
				Serchbook=sc.nextLine();
				for(int i=0;i<60;i++) {
				if(BookList[i].getpublisher().equals(Serchbook)) {
					BookList[i].showinfo();
				}
				
			}
				break;}
			case 4: {
				System.out.print("도서관 입력:");
				Serchbook=sc.next();
				for(int i=0;i<60;i++) {
				if(BookList[i].getlibraryname().equals(Serchbook)) {
					BookList[i].showinfo();
				}
			}
				break;}
			case 5: {
				System.out.print("시작일 입력:");
				Serchbook=sc.next();
				System.out.print("끝일 입력:");
				Endbook=sc.next();
				StringTokenizer endtok=new StringTokenizer(Endbook, "-");
				int id=0;
				while(endtok.hasMoreTokens())
				{
					endpy[id] = Integer.parseInt(endtok.nextToken());
					id++;
				}
				StringTokenizer strtok=new StringTokenizer(Serchbook, "-");
				int id2=0;
				while(strtok.hasMoreTokens())
				{	
					serpy[id2] = Integer.parseInt(strtok.nextToken());
					id2++;
				}
				for(int i=0;i<60;i++) {
				StringTokenizer boktok=new StringTokenizer(BookList[i].getpy(), "-");
				int id3=0;
				while(boktok.hasMoreTokens()) {
					bokpy[id3] = Integer.parseInt(boktok.nextToken());
					id3++;	
				}
				int jud[] = new int[3];
				int jnum=0;
				for(int j=0;j<3;j++) {
				if(bokpy[j]>=serpy[j]&&bokpy[j]<=endpy[j]) {
					jud[j]=1;
				}
				}
				for(int k=0;k<3;k++) {
					jnum+=jud[k];
				}
				if(jnum==3) {
					BookList[i].showinfo();
				}
				
			}
			break;}
			case 6: {
				System.out.print("ID를 입력하세요:");
				mnum=sc.nextInt();
				for(int i=0;i<BookList.length;i++) {
					if(BookList[i].getID()==mnum) {
				if(BookList[i].getrvt()==false&&BookList[i].getisCheckOut()) {
					System.out.println("예약 대출 가능");
					System.out.println("예약하실건가요?\n1.yes\n2.no");
					int mnum2;
					mnum2=sc.nextInt();
					if (mnum2==1) {
						BookList[i].setrvt(true);
						System.out.println("예약완료\n");
					}
					else {System.out.println("메뉴로 이동");}
				}
				else {System.out.println("예약 불가");}
				}
				}
			}
			break;}//case 6 end
		}//switch end
}

	public static void main(String[] args) {
		Book BookList[]=new Book[60];
		Scanner sc = new Scanner(System.in);



		BookList[0]=new Book("어른의 어휘력", "유선경", "앤의서재", "2020-08-15", 344, "대구광역시립중앙도서관", 1001, "인문자료실", 0, false);
		BookList[1]=new Book("코로나 사피엔스", "최재천", "인플루엔셜", "2020-06-10", 200, "대구광역시립중앙도서관", 1002, "인문자료실", 0, false);
		BookList[2]=new Book("미움받을 용기1", "고가 후미타케", "인플루엔셜", "2014-11-17", 336, "대구광역시립중앙도서관", 1003, "인문자료실", 0, false);
		BookList[3]=new Book("공부란 무엇인가", "김영민", "어크로스", "2020-08-26", 272, "대구광역시립중앙도서관", 1004, "인문자료실", 0, false);
		BookList[4]=new Book("하루 10분 인문학", "이준형", "나무의철학", "2020-09-10", 376, "대구광역시립중앙도서관", 1005, "인문자료실", 0, false);
		BookList[5]=new Book("매우 예민한 사람들" , "진홍진", "글항아리", "2020-07-23", 388, "대구광역시립중앙도서관", 1006, "인문자료실", 0, false);
		BookList[6]=new Book("두 번째 산", "데이비드 브룩스", "부키", "2020-09-24", 600, "대구광역시립중앙도서관", 1007, "인문자료실", 0, false);
		BookList[7]=new Book("사피엔스", "유발 하라리", "김영사", "2015-11-24", 636, "대구광역시립중앙도서관", 1008, "인문자료실", 0, false);
		BookList[8]=new Book("딸은 엄마의 감정을 먹고 자란다", "박우란", "유노북스", "2020-07-20", 288, "대구광역시립중앙도서관", 1009, "인문자료실", 0, false);
		BookList[9]=new Book("당신이 옳다", "정혜신", "해냄출판사", "2018-10-10", 316, "대구광역시립중앙도서관", 1010, "인문자료실", 0, false);



		BookList[10]=new Book("지리의 힘", "팀마샬", "사이", "2016-08-10", 368, "대구광역시립중앙도서관", 2001, "인문자료실", 0, false);
		BookList[11]=new Book("총,균,쇠", "제레드 다이아몬드", "문학사상사", "2005-12-19", 344, "대구광역시립중앙도서관", 2002, "인문자료실", 0, false);
		BookList[12]=new Book("리더라면 정조처럼", "김준혁", "더봄", "2020-06-20", 368, "대구광역시립중앙도서관", 2003, "인문자료실", 0, false);
		BookList[13]=new Book("설민석의 조선왕조 실록", "설민석", "세계사", "2016-07-20", 504, "대구광역시립중앙도서관", 2004, "인문자료실", 0, false);
		BookList[14]=new Book("역사의 쓸모", "최태성", "다산초당", "2019-11-22", 296, "대구광역시립중앙도서관", 2005, "인문자료실", 0, false);
		BookList[15]=new Book("30개 도시로 읽는 세계사", "조 지무쇼", "다산북스", "2020-07-06", 344, "대구광역시립중앙도서관", 2006, "인문자료실", 0, false);
		BookList[16]=new Book("낭송 세종실록", "질 볼트 테일러", "북드라망", "2017-10-26", 320, "대구광역시립중앙도서관", 2007, "인문자료실", 0, false);
		BookList[17]=new Book("읽기만 하면 내것이 되는 1페이지", "심용환", "비에이블", "2020-06-17", 384, "대구광역시립중앙도서관", 2008, "인문자료실", 0, false);
		BookList[18]=new Book("도미니언", "톰 홀랜드", "책과함께", "2020-09-14", 856, "대구광역시립중앙도서관", 2009, "인문자료실", 0, false);
		BookList[19]=new Book("설민석의 무도 한국사 특강", "설민석", "휴먼큐브", "2019-01-29", 433, "대구광역시립중앙도서관", 2010, "인문자료실", 0, false);



		BookList[20]=new Book("한번도 경험해보지 못한 나라", "강양구", "천년의상상", "2020-08-25", 340, "대구광역시립중앙도서관", 3001, "인문자료실", 0, false);
		BookList[21]=new Book("코로나 사피엔스", "최재천", "인플루엔셜", "2020-06-10", 200, "대구광역시립중앙도서관", 3002, "인문자료실", 0, false);
		BookList[22]=new Book("레이건 일레븐", "폴 켄고르", "열아홉", "2020-08-18", 280, "대구광역시립중앙도서관", 3003, "인문자료실", 0, false);
		BookList[23]=new Book("지리의 힘", "팀 마샬", "사이", "2016-08-10", 368, "대구광역시립중앙도서관", 3004, "인문자료실", 0, false);
		BookList[24]=new Book("총,균,쇠", "제레드 다이아몬드", "문학사상사", "2005-12-19", 751, "대구광역시립중앙도서관", 3005, "인문자료실", 0, false);
		BookList[25]=new Book("선량한 차별주의자", "김지혜", "창비", "2019-07-17", 244, "대구광역시립중앙도서관", 3006, "인문자료실", 0, false);
		BookList[26]=new Book("팩트풀니스", "한스 로슬링", "김영사", "2019-03-10", 474, "대구광역시립중앙도서관", 3007, "인문자료실", 0, false);
		BookList[27]=new Book("오늘부터의 세계", "안희경", "메디치미디어", "2020-07-16", 232, "대구광역시립중앙도서관", 3008, "인문자료실", 0, false);
		BookList[28]=new Book("정의란 무엇인가", "마이클 센델", "와이즈베리", "2014-11-20", 443, "대구광역시립중앙도서관", 3009, "인문자료실", 0, false);
		BookList[29]=new Book("나는 풍요로웠고 지구는 달라졌다", "호프 자런", "김영사", "2020-09-04", 276, "대구광역시립중앙도서관", 3010, "인문자료실", 0, false);



		BookList[30]=new Book("코스모스", "칼 세이건", "사이언스북스", "2006-12-20", 719, "대구광역시립중앙도서관", 4001, "종합자료실", 0, false);
		BookList[31]=new Book("이기적 유전자", "리처드 도킨스", "을유문화사", "2018-10-20", 344, "대구광역시립중앙도서관", 4002, "종합자료실", 0, false);
		BookList[32]=new Book("1분 과학", "이재범", "위즈덤하우스", "2020-09-03", 344, "대구광역시립중앙도서관", 4003, "종합자료실", 0, false);
		BookList[33]=new Book("사소해서 물어보지 못했지만 궁금했던 이야기", "사물궁이 잡학지식", "아르테", "2020-09-16", 240, "대구광역시립중앙도서관", 4004, "종합자료실", 0, false);
		BookList[34]=new Book("노화의 종말", "데이비드 A 싱", "부키", "2020-07-30", 624, "대구광역시립중앙도서관", 4005, "종합자료실", 0, false);
		BookList[35]=new Book("나는 풍요로웠고, 지구는 달라졌다", "호프 자런", "김영사", "2020-09-04", 276, "대구광역시립중앙도서관", 4006, "종합자료실", 0, false);
		BookList[36]=new Book("다시, 수학이 필요한 순간", "김민형", "인플루엔셜", "2020-08-12", 448, "대구광역시립중앙도서관", 4007, "종합자료실", 0, false);
		BookList[37]=new Book("수학이 필요한 순간", "김민형", "인플루엔셜", "2018-08-03", 328, "대구광역시립중앙도서관", 4008, "종합자료실", 0, false);
		BookList[38]=new Book("까면서 보는 해부학 만화", "압듈라", "한빛비즈", "2020-06-19", 304, "대구광역시립중앙도서관", 4009, "종합자료실", 0, false);
		BookList[39]=new Book("정재승의 과학 콘서트", "정재승", "어크로스", "2020-07-07", 388, "대구광역시립중앙도서관", 4010, "종합자료실", 0, false);



		BookList[40]=new Book("비밀의 숲 시즌2 : 상", "이수연", "북로그컴퍼니", "2020-10-20", 400, "대구광역시립중앙도서관", 5001, "종합자료실", 0, false);
		BookList[41]=new Book("비밀의 숲 시즌2 : 하", "이수연", "북로그컴퍼니", "2020-10-20", 400, "대구광역시립중앙도서관", 5002, "종합자료실", 0, false);
		BookList[42]=new Book("방구석 미술관", "조원재", "블랙피쉬", "2018-08-03", 344, "대구광역시립중앙도서관", 5003, "종합자료실", 0, false);
		BookList[43]=new Book("비밀의 숲 1", "이수연", "북로그컴퍼니", "2017-08-11", 408, "대구광역시립중앙도서관", 5004, "종합자료실", 0, false);
		BookList[44]=new Book("비밀의 숲 2", "이수연", "북로그컴퍼니", "2017-08-11", 400, "대구광역시립중앙도서관", 5005, "종합자료실", 0, false);
		BookList[45]=new Book("김락희의 인체 드로잉", "김락희", "성안당", "2019-11-26", 392, "대구광역시립중앙도서관", 5006, "종합자료실", 0, false);
		BookList[46]=new Book("만화 컷 분할 교실", "후카야 아키라", "삼호미디어", "2020-07-27", 304, "대구광역시립중앙도서관", 5007, "종합자료실", 0, false);
		BookList[47]=new Book("시와 그림 사이", "나태주", "북로그컴퍼니", "2020-09-14", 108, "대구광역시립중앙도서관", 5008, "종합자료실", 0, false);
		BookList[48]=new Book("사이코지만 괜찮아 2", "조용", "호우야", "2020-08-27", 520, "대구광역시립중앙도서관", 5009, "종합자료실", 0, false);
		BookList[49]=new Book("서양 미술사", "에른스트 곰브리치", "예경", "2003-07-10", 688, "대구광역시립중앙도서관", 5010, "종합자료실", 0, false);


		BookList[50]=new Book("쓰담쓰닮 로마서", "햇살콩", "규장", "2020-08-31", 128, "대구광역시립중앙도서관", 6001 ,"인문자료실", 0, false);
		BookList[51]=new Book("내가 너를 아노라", "김양재", "큐티엠", "2020-09-15", 344,  "대구광역시립중앙도서관", 6002 ,"인문자료실", 0, false);
		BookList[52]=new Book("쓰담쓰닮 요한복음", "햇살콩", "규장", "2020-06-26", 208, "대구광역시립중앙도서관", 6003 ,"인문자료실", 0, false);
		BookList[53]=new Book("도미니언", "톰 홀랜드", "책과함께", "2020-09-14", 856,  "대구광역시립중앙도서관", 6004 ,"인문자료실", 0, false);
		BookList[54]=new Book("초인생활 : 탐사록", "베어드 T. 스폴딩", "정신세계사", "2020-08-25", 592, "대구광역시립중앙도서관", 6005 ,"인문자료실", 0, false);
		BookList[55]=new Book("초인생활 2 (강의록)", "베어드 T. 스폴딩", "정신세계사", "2020-08-28", 328,  "대구광역시립중앙도서관", 6006 ,"인문자료실", 0, false);
		BookList[56]=new Book("다시 춤추기 시작할때까지", "윌터 브루그만", "IVP", "2020-06-29", 160,  "대구광역시립중앙도서관", 6007 ,"인문자료실", 0, false);
		BookList[57]=new Book("아직 결혼하지 않은 당신에게", "마셜 시걸", "생명의말씀사", "2020-09-07", 296,  "대구광역시립중앙도서관", 6008 ,"인문자료실", 0, false);
		BookList[58]=new Book("탈무드", "마빈 토카이어", "인디북", "2001-03-05", 286,  "대구광역시립중앙도서관", 6009 ,"인문자료실", 0, false);
		BookList[59]=new Book("중동의 눈으로 본 예수", "케네스 E 베일리", "새물결플러스", "2016-03-24", 688,  "대구광역시립중앙도서관", 6010 ,"인문자료실", 0, true);
	
		menus(BookList);
}
}

