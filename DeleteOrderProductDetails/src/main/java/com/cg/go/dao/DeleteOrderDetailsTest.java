package com.cg.go.dao;
import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.VerificationCollector;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cg.go.dto.OrderProductMapDTO;
import com.cg.go.service.OrderServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
public class DeleteOrderDetailsTest {
@Rule
public VerificationCollector verificationCollector = MockitoJUnit.collector();
@Mock
    private OrderProductMapDao dao;
@InjectMocks
private OrderServiceImpl service;

@Before
public void setup(){
MockitoAnnotations.initMocks(this);
}
@Test
public void getDeleteByOrderIdDetails(){
List<OrderProductMapDTO> orderList = new ArrayList<OrderProductMapDTO>();
orderList.add(new OrderProductMapDTO("o1","p1","pu1",2,0));
orderList.add(new OrderProductMapDTO("o3","p2","pu2",6,1));
when(dao.findByOrderId(null)).thenReturn(orderList);
//List<OrderProductMapDTO> result = dao.getorderList(null);
assertEquals(2, orderList.size());
}
}
