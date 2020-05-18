package com.cg.go.dao;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.sql.Date;
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

import com.cg.go.dto.OrderDTO;
import com.cg.go.service.GetOSServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
public class GetOrderAndCartTest {
@Rule
public VerificationCollector verificationCollector = MockitoJUnit.collector();
@Mock
    private GetOrderStatusDao dao;
@InjectMocks
private GetOSServiceImpl service;

@Before
public void setup(){
MockitoAnnotations.initMocks(this);
}
@Test
public void getDeleteByOrderIdDetails(){
List<OrderDTO> cartList = new ArrayList<OrderDTO>();
String str="2020-03-30";
Date initiate=Date.valueOf(str);
String str1="2020-04-10";
Date dispatch=Date.valueOf(str1);
cartList.add(new OrderDTO("o5","u5","ua5","not dispatched",initiate,dispatch));
when(dao.findByUserId(null)).thenReturn(cartList);
//List<OrderProductMapDTO> result = dao.getorderList(null);
assertEquals(1, cartList.size());
}
}
