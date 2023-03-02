package com.db.merchant_solution;

import com.db.merchant_solution.service.Application;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class MerchantSolutionApplicationUnitTest {

    @InjectMocks
    private Application application;

    @Test
    public void testSignalOne() {
        application.handleSignal(1);
    }

    @Test
    public void testSignalTwo() {
        application.handleSignal(2);
    }
}
