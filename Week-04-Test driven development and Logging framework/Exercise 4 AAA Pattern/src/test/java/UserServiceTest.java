import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class UserServiceTest {


    UserService service;


    @BeforeEach
    void setup(){

        service = new UserService();

        System.out.println("Setup completed");

    }


    @Test
    void testGetUserName(){


        // Arrange
        String expectedName = "Bhavani";


        // Act
        String actualName = service.getUserName();


        // Assert
        assertEquals(expectedName, actualName);


    }


    @AfterEach
    void tearDown(){

        System.out.println("Test completed");

    }


}