package kr.co.emaillist.dao.test;

import java.util.List;

import kr.co.emaillist.dao.EmaillistDao;
import kr.co.emaillist.dao.vo.EmaillistVo;

public class EmaillistDaoTest {

	public static void main(String[] args) {
		insertTest();
		getListTest();
		deleteAll();
	}
	
	private static void deleteAll() {
		new EmaillistDao().delete();
	}

	public static void insertTest() {
		EmaillistVo vo = new EmaillistVo();
		vo.setFirstname("대혁");
		vo.setLastname("안");
		vo.setEmail("kickscar@gmail.com");
		System.out.println(vo);

		new EmaillistDao().insert(vo);
	}

	public static void getListTest() {
		List<EmaillistVo> list = new EmaillistDao().getList();

		for (EmaillistVo vo : list) {
			System.out.println(vo);
		}
	}

}
