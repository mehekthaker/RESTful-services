package com.cg.customers.junitimplementation.JUnitCustomers;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.cg.JUnitCustomers.customers.Customer;
import com.cg.JUnitCustomers.customers.controller.CustomerController;
import com.cg.JUnitCustomers.customers.service.ServiceImpl;

@RunWith(SpringRunner.class)
@WebMvcTest(value=CustomerController.class, secure = false)
public class JUnitCustomersApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ServiceImpl service;
	
	Customer mockCustomer = new Customer();

	String exampleCourseJson = "{\"customerId\":\"122\",\"customerName\":\"Nyaah\",\"contactNumber\":\"986755\",\"emailId\":\"nyaah@gmail.com\",\"dateOfbirth\":\"22/7/1996\"}";

	@Test
	public void retrieveDetailsOfCustomer() throws Exception {

		Mockito.when(
				service.viewAllCustomers().thenReturn(mockCourse);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/customers").accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println(result.getResponse());
		String expected = "{customerId:122,customerName:Nyaah,contactNumber:986755,emailId:nyaah@gmail.com,dateOfBirth:22/7/1996}";

		// {"id":"Course1","name":"Spring","description":"10 Steps, 25 Examples and 10K Students","steps":["Learn Maven","Import Project","First Example","Second Example"]}

		JSONAssert.assertEquals(expected, result.getResponse()
				.getContentAsString(), false);
	}
	
	/*@Test
	public void CustomerNotNull() {
		Customer customer = new Customer();
		if(customer == null) {
			assertEquals
		}
	}*/

}
