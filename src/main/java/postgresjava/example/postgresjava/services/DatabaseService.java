package postgresjava.example.postgresjava.services;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService implements InitializingBean, DisposableBean {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void afterPropertiesSet() throws Exception {
        // Connect to the database
        System.out.println("Connecting to PostgresSQL database...");

        jdbcTemplate.execute("SELECT 1");

        System.out.println("Connected to PostgresSQL database");
    }

    @Override
    public void destroy() throws Exception {
        // Close database connection
        System.out.println("Closing PostgresSQL database connection....");

        // No need to explicitly close DataSource or JdbcTemplate in sping Boot
        System.out.println("Closed PostgresSQL database connection.");
    }

}
