import com.alibaba.fastjson.*;
import com.dcj.spring.pojo.*;
import com.dcj.spring.service.*;
import org.apache.log4j.*;
import org.junit.*;
import org.junit.runner.*;
import org.springframework.test.context.*;
import org.springframework.test.context.junit4.*;

import javax.annotation.*;

/**
 * Created by dcj on 2016/10/22.
 */

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class Test_dcj {
    private static Logger logger = Logger.getLogger(Test_dcj.class);
    @Resource
    private IUserService userService;


    @Test
    public void test() {
        User user = userService.getUserById(2);
        logger.info(JSON.toJSONString(user));
    }
}
