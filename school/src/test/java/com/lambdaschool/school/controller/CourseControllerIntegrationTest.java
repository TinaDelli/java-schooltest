package com.lambdaschool.school.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CourseControllerIntegrationTest
{
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp() throws Exception
    {
        RestAssuredMockMvc.webAppContextSetup(webApplicationContext);
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void listAllCourses()
    {
    }

    @Test
    public void getCountStudentsInCourses()
    {
    }

    @Test
    public void getCourseById()
    {
    }

    @Test
    public void deleteCourseById()
    {
    }
}