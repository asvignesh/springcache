package in.asvignesh.springcache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vignesh
 */
@RestController
public class ControllerTest {

  @Autowired
  TestService testService;

  @GetMapping("/test/{id}")
  public TestModel findStudentById(@PathVariable String id) {
    System.out.println("Searching by ID  : " + id);
    return testService.getTest(id);
  }

}
