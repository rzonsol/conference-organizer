package pl.rzonsol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.rzonsol.config.AppConfig;
import pl.rzonsol.model.Role;
import pl.rzonsol.model.User;
import pl.rzonsol.services.RoleService;
import pl.rzonsol.services.UserService;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ConferenceOrganizerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConferenceOrganizerApplication.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();

		UserService userService = (UserService)ctx.getBean("userService");

		RoleService roleService = (RoleService)ctx.getBean("roleService");



//		Role role1 = new Role();
//		role1.setRole("Editor");
//		Role role2 = new Role();
//		role2.setRole("Admin");
//		roleService.addRole(role1);
//		roleService.addRole(role2);

//		ObjectId objectId = new ObjectId("588ddbd8e0dae556fd0850c0");
//		Role role = roleService.getRoleById(objectId);
//
//		ObjectId objectId1 = new ObjectId("588ddb00e0dae556e908daae");
//		Role role1 = roleService.getRoleById(objectId1);

//		roleService.deleteRole(objectId);
//		roleService.deleteRole(role1);

		Role role = roleService.getRoleByName("Admin");

		List<Role> roles = new ArrayList<>();
		roles.add(role);

		User user = new User();
		user.setFirstName("piotr3");
		user.setLastName("rzonsowski3");
		user.setRoles(roles);

		userService.addUser(user);
//		user.toString();
	}
}
