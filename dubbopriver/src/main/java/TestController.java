import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by XG on 2017/6/23.
 */
@Controller
public class TestController {

    @Autowired
    private TestServer testServer;

    @RequestMapping("/")
    @ResponseBody
    public String getTest(){
        return testServer.getTest();
    }

}
