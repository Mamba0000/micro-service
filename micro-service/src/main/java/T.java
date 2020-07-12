
//import org.springframework.cloud.client.SpringCloudApplication;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringCloudApplication
@EnableFeignClients
@MapperScan("com.jn.**.dao")

public class T {

    //        SpringApplication.run(ShiroAdminApplication.class, args);

}


