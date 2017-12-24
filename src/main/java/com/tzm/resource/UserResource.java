package com.tzm.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tzm.bean.UserBean;
import com.tzm.service.UserService;

@Component
@Path(value = "user")
public class UserResource {

	@Autowired
	private UserService userService;

	@GET
	@Path(value = "/{userId}")
	@Produces(MediaType.APPLICATION_JSON)
	public UserBean get(@PathParam("userId") String userId) {
		return userService.get(userId);
	}

	@GET
	@Path(value = "/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<UserBean> gets() {
		return userService.gets();
	}

	@POST
	@Path(value = "/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public void add(UserBean user) {
		userService.add(user);
	}

	@PUT
	@Path(value = "/update")
	@Consumes(MediaType.APPLICATION_JSON)
	public void update(UserBean user) {
		userService.update(user);
	}

	@PUT
	@Path(value = "/${innerId}")
	public void delete(@PathParam("innerId") String innerId) {
		userService.delete(innerId);
	}
}
