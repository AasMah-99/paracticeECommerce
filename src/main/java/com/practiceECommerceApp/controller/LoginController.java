package com.practiceECommerceApp.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.practiceECommerceApp.service.CustomerService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
public class LoginController {
	
	@Autowired
	CustomerService customerService;
	
	
	
//	@RequestMapping(value = "/issue.spring", method = RequestMethod.GET)
//	public ModelAndView preLogin(HttpServletRequest request, @ModelAttribute("user") User user) {
//		ModelAndView mav = new ModelAndView();
//		HttpSession session = request != null ? request.getSession(false) : null;
//		if (session != null && session.getAttribute("userName") != null) {
//
//			if (session.getAttribute("status").equals("Admin")) {
//				ArrayList<Issue> issueDetail = dbUtil.getIssueDetail();
//				mav.addObject("issueDetail", issueDetail);
//				mav.addObject("totalIssue", dbUtil.getTotalIssue());
//				mav.addObject("totalSolved", dbUtil.getTotalSolved());
//				mav.addObject("totalPending", dbUtil.getTotalPending());
//				mav.addObject("totalFixing", dbUtil.getTotalFixing());
//				mav.setViewName("home");
//			} else if (session.getAttribute("status").equals("Attendee")) {
//				String resrcId = (String) session.getAttribute("resrcId");
//				ArrayList<Issue> issueDetail = dbUtil.getIssueDetail(resrcId);
//				mav.addObject("issueDetail", issueDetail);
//				mav.addObject("totalIssue", dbUtil.getResrcTotalIssue(resrcId));
//				mav.addObject("totalSolved", dbUtil.getResrcTotalSolved(resrcId));
//				mav.addObject("totalPending", dbUtil.getResrcTotalPending(resrcId));
//				mav.addObject("totalFixing", dbUtil.getResrcTotalFixing(resrcId));
//				mav.setViewName("homeAttendee");
//			} else if (session.getAttribute("status").equals("Client")) {
//				String userName = (String) session.getAttribute("userName");
//				ArrayList<Issue> issueDetail = dbUtil.getClientIssues(userName);
//				mav.addObject("issueDetail", issueDetail);
//				mav.addObject("totalIssue", dbUtil.getClientTotalIssue(userName));
//				mav.addObject("totalSolved", dbUtil.getClientTotalSolved(userName));
//				mav.addObject("totalPending", dbUtil.getClientTotalPending(userName));
//				mav.addObject("totalFixing", dbUtil.getClientTotalFixing(userName));
//				mav.setViewName("homeClient");
//			}
//		} else
//			mav.setViewName("login");
//		return mav;
//	}
//
//	@RequestMapping(value = "/issue.spring", method = RequestMethod.POST)
//	public ModelAndView postLogin(HttpServletRequest request, @ModelAttribute("user") User user) {
//		ModelAndView mav = new ModelAndView();
//		String userName = user.getUserName();
//		String passWord = user.getPassWord();
//		User userInfo = dbUtil.getUserInfo(userName, passWord);
//		if (userName != null && !userName.isEmpty() && passWord != null && !passWord.isEmpty() && userInfo != null) {
//			HttpSession session = request.getSession();
//			session.setAttribute("userName", userName);
//			session.setAttribute("userId", userInfo.getUserId());
//			String resrcId = userInfo.getResrcId();
//			session.setAttribute("resrcId", resrcId);
//			session.setAttribute("status", userInfo.getStatus());
//
//			if (session.getAttribute("status").equals("Admin")) {
//				ArrayList<Issue> issueDetail = dbUtil.getIssueDetail();
//				mav.addObject("issueDetail", issueDetail);
//				mav.addObject("totalIssue", dbUtil.getTotalIssue());
//				mav.addObject("totalSolved", dbUtil.getTotalSolved());
//				mav.addObject("totalPending", dbUtil.getTotalPending());
//				mav.addObject("totalFixing", dbUtil.getTotalFixing());
//				mav.setViewName("home");
//			} else if (session.getAttribute("status").equals("Attendee")) {
//				ArrayList<Issue> issueDetail = dbUtil.getIssueDetail(resrcId);
//				mav.addObject("issueDetail", issueDetail);
//				mav.addObject("totalIssue", dbUtil.getResrcTotalIssue(resrcId));
//				mav.addObject("totalSolved", dbUtil.getResrcTotalSolved(resrcId));
//				mav.addObject("totalPending", dbUtil.getResrcTotalPending(resrcId));
//				mav.addObject("totalFixing", dbUtil.getResrcTotalFixing(resrcId));
//				mav.setViewName("homeAttendee");
//			} else if (session.getAttribute("status").equals("Client")) {
//				ArrayList<Issue> issueDetail = dbUtil.getClientIssues(userName);
//				mav.addObject("issueDetail", issueDetail);
//				mav.addObject("totalIssue", dbUtil.getClientTotalIssue(userName));
//				mav.addObject("totalSolved", dbUtil.getClientTotalSolved(userName));
//				mav.addObject("totalPending", dbUtil.getClientTotalPending(userName));
//				mav.addObject("totalFixing", dbUtil.getClientTotalFixing(userName));
//				mav.setViewName("homeClient");
//			}
//		} else {
//			mav.addObject("message", "Login Failed!");
//			mav.setViewName("login");
//		}
//		return mav;
//	}
//
//	@RequestMapping(value = "/logout.spring", method = RequestMethod.GET)
//	public ModelAndView logout(@ModelAttribute("user") User user, HttpServletRequest request) {
//		ModelAndView mav = new ModelAndView("login");
//		HttpSession session = request.getSession(false);
//		if (session != null)
//			session.invalidate();
//		return mav;
//	}

}
