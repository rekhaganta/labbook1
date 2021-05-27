package com.cg.cms;

//public class CustomerCrudApplication {
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

	import com.cg.cms.entities.Customer;
	import com.cg.cms.service.ICustomerService;

	import io.swagger.annotations.ApiOperation;

	@RestController
	@SpringBootApplication
	public class CustomerCrudApplication {

		public static void main(String[] args) {
			SpringApplication.run(CustomerCrudApplication.class, args);
		}
	}

//		@Autowired
//		private ICustomerService service; // CustomerService is a dependency
//
//		@GetMapping("/{name}")
//		@ApiOperation("Greetings API")
//		public String greetings(@PathVariable String name) {
//			return "<h1>Welcome to Spring Boot swagger" + name + "</h1>";
//
//		}
//
//		@GetMapping("/getById{id}")
//		@ApiOperation("Get Customer By Id")
//		public Customer FetchById(@PathVariable String id) {
//			return service.fetchById(Integer.valueOf(id));
//
//		}
//
//		@GetMapping("/getAll")
//		@ApiOperation("Fetch all Customers by Details")
//		public List<Customer> fetch() {
//			return service.fetchAll();
//
//		}
//
//		@PostMapping("/save")
//		public void save(@RequestBody Customer customer) {
//			service.addCustomer(customer);
//		}
//
//		@PutMapping("/update")
//		public void update(@RequestBody Customer customer) {
//			service.updateCustomer(customer);
//		}
//
//		@DeleteMapping("/delete/{id}")
//		public void delete(@PathVariable String id) {
//			service.delCustomer(Integer.valueOf(id));
//		}
//
//	
//}
