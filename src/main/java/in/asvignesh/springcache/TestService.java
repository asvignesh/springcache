package in.asvignesh.springcache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author vignesh
 */
@Service
public class TestService {
  @Cacheable("test")
  public TestModel getTest(String id) {

    try {
      System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
      Thread.sleep(1000 * 5);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    return new TestModel(id, "Sajal");
  }
}
