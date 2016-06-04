package cn.com.xiaofen.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import cn.com.xiaofen.model.Hello;
import cn.com.xiaofen.service.HelloService;


@Controller
public class IndexAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	@Autowired
	private HelloService helloService;
	@Override
	public String execute() throws Exception {
		Hello hello=helloService.get(1);
		hello.hello();
		return SUCCESS;
	}

}
