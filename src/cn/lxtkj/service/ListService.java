package cn.lxtkj.service;

import java.util.List;

import cn.lxtkj.bean.Message;
import cn.lxtkj.dao.MessageDao;

/*
 * 列表业务相关的功能
 */
public class ListService {
	public List<Message> queryMessageList(String command, String description) {
		MessageDao messageDao = new MessageDao();
		return messageDao.queryMessageList(command, description);
	}
}
