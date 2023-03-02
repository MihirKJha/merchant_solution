package com.db.merchant_solution;

import com.db.merchant_solution.service.Application;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(MockitoExtension.class)
class MerchantSolutionApplicationUnitTest {

    @InjectMocks
    private Application application;

    @Test
    public void testSignalOne() throws Exception {
        application.handleSignal(1);
    }

    @Test
    public void testSignalTwo() throws Exception {
        application.handleSignal(2);
    }
}
