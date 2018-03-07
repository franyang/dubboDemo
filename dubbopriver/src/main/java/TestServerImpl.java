import org.springframework.stereotype.Service;

/**
 * Created by XG on 2017/6/23.
 */
@Service
public class TestServerImpl implements TestServer {
    @Override
    public String getTest(){
        return "hello dubbo";
    }
}
