package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.BVO;
import com.ict.db.CVO;
import com.ict.db.DAO;

public class OneListCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		  String b_idx = request.getParameter ("b_idx");
		  
		  int result = DAO.getHitUp(b_idx);
		  
		  
		  
		  BVO bvo = DAO.getOneList(b_idx);
		   request.getSession().setAttribute("bvo", bvo);
		   
		   //b_idx를 가지고 관련 댓글 가져오기
		   List<CVO> c_List = DAO.getcList(b_idx);
		   request.setAttribute("c_list", c_List);
		   
		return "view/onelist.jsp";
	}
}
