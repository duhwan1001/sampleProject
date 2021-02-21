package service;

import java.util.List;
import java.util.Map;

import util.ScanUtil;
import util.View;
import dao.BoardDao;
import dao.UserDao;

public class BoardService {
	
	private BoardService(){}
	private static BoardService instance;
	public static BoardService getInstance(){
		if(instance == null){
			instance = new BoardService();
		}
		return instance;
	}
	
	private BoardDao boardDao = BoardDao.getInstance();
	
	public int boardList(){
		List<Map<String, Object>> boardList = boardDao.selectBoardList();
		
		System.out.println("=======================================");
		System.out.println("번호\t제목\t작성자\t작성일");
		System.out.println("---------------------------------------");
		for(Map<String, Object> board : boardList){
			System.out.println(board.get("BOARD_NO")
					+ "\t" + board.get("TITLE")
					+ "\t" + board.get("USER_NAME")
					+ "\t" + board.get("REG_DATE"));
		}
		System.out.println("=======================================");
		System.out.println("1.조회\t2.등록\t0.로그아웃");
		System.out.print("입력>");
		
		int input = ScanUtil.nextInt();
		switch (input) {
		case 1:
			
			break;
		}
		
		return View.BOARD_LIST;
	}
	
}









