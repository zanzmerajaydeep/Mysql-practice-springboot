package com.einfochips.controller;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.einfochips.dto.OrderRequest;
import com.einfochips.dto.RequestResponse;
import com.einfochips.exception.DataNotFoundWithId;
import com.einfochips.model.Laptop;
import com.einfochips.model.Product;
import com.einfochips.model.Student;
import com.einfochips.repository.LaptopRepository;
import com.einfochips.repository.ProductRepository;
import com.einfochips.repository.StudentRepository;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class StudentController {

	Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	RestTemplate restTemplate;

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	LaptopRepository laptopRepository;

	@Autowired
	ProductRepository productRepository;

	@Autowired
	private ModelMapper mapper;

	public Student toStudent(OrderRequest orderRequest) {
		return this.mapper.map(orderRequest, Student.class);
	}

	public RequestResponse toRequestResponse(Student student) {
		return mapper.map(student, RequestResponse.class);

	}

	@PostMapping("/insert-student")
	public RequestResponse insertStudent(@Validated @RequestBody OrderRequest orderRequest) {

		Student student = this.toStudent(orderRequest);
		Student student2 = studentRepository.save(student);
		return this.toRequestResponse(student2);

	}

	@PostMapping("/insert-laptop")
	public String insertLaptop(@RequestBody Laptop laptop) {

		laptopRepository.save(laptop);

		return "student inserted";
	}

	@PostMapping("/insert-product")
	public String insertLaptop(@RequestBody Product product) {

		productRepository.save(product);

		return "student inserted";
	}

	@GetMapping("/getStudent")
	public List<Student> getStudent() {
		return studentRepository.findAll();
	}

	@GetMapping("/getLaptop")
	public List<Laptop> getLaptop() {
		logger.info("api call get laptop");
		return laptopRepository.findAll();
	}

	@GetMapping("/getStudentById/{id}")
	public Optional<Student> getLaptop(@PathVariable int id) {
		return studentRepository.findById(id);
	}

	@PutMapping("/update-student/{id}")
	public ResponseEntity<?> updateStudent(@PathVariable int id, @RequestBody OrderRequest orderRequest) {
		
		Student student = this.toStudent(orderRequest);
		if (studentRepository.existsById(id)) {
			return ResponseEntity.ok(studentRepository.save(student));
		} else {
			throw new DataNotFoundWithId(id);
		}

	}
	
	@DeleteMapping("/deleteById/{id}")
	public  ResponseEntity<String> deleteStudent(@PathVariable int id) {
		Student student=studentRepository.findById(id).orElseThrow( ()-> new DataNotFoundWithId(id));
		if(student != null)
		{
			 student.setLaptop(null);
			 studentRepository.deleteById(id);
			 return ResponseEntity.status(HttpStatus.OK).body("Student successfully deleted with Id : "+id);	
		}else
		{
		 return	ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No record fubd with id :"+id);
		}
		}

	// =======================================================================

	@GetMapping("/start")
	public ModelAndView getView() {

		ModelAndView mv = new ModelAndView("Register");
		return mv;
	}

	@GetMapping("addData")
	public ModelAndView getRegister(HttpServletRequest request) {

		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String contact = request.getParameter("contact");
		ModelAndView mv = new ModelAndView("success");

		mv.addObject("name", name);
		mv.addObject("sname", surname);
		// mv.addObject("contact",contact);

		return mv;
	}
	
	@GetMapping("/getTest")
	public String getStudent1() {
		String str=restTemplate.getForObject("http://localhost:8081/", String.class);
		return str;
	}

}
