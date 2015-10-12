import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

/*
 * Created by Dev on 12/10/2015.
 */

@Configuration
public class AppConfig
{
    @Bean(name = "customerService")
    public CustomerService getCustomerService()
    {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.setCustomerRepository(getCustomerRepository());

        return customerService;
    }

    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository()
    {
        return new HibernateCustomerRepositoryImpl();
    }
}
