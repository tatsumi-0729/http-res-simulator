package controller;

import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class simulator {

	@RequestMapping("simulator")
	public ResponseEntity<InputStream> res(HttpServletResponse res, HttpServletRequest req) {

		return new ResponseEntity("simulator test", null, HttpStatus.OK);
	}
}
