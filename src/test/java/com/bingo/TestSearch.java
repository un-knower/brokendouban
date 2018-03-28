package com.bingo;

import com.bingo.common.Const;
import com.bingo.controller.portal.UserController;
import com.bingo.domain.Movie;
//import com.bingo.repository.MovieSearchRepository;
import com.bingo.domain.User;
import com.bingo.repository.MovieRepository;
import com.bingo.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestSearch {

        @Autowired
        private UserRepository userRepository;

        @Autowired
        private MovieRepository movieRepository;

        @Test
        public void test2()
        {

            System.out.println(movieRepository.selectQuestionnaire());

        }
        @Test
        public void test3()
        {   int id = 9;
            Process proc = null;
            try {
                System.out.println("python " + Const.PY_URL+"\\src\\main\\resources\\testItem.py "+id);
                proc = Runtime.getRuntime().exec("python " + Const.PY_URL+"\\src\\main\\resources\\testItem.py "+id);
                proc.waitFor();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

//    @Autowired
//    private MovieSearchRepository movieSearchRepository;
//    @Test
//    public void testSaveArticleIndex(){
//        Movie movie=new Movie();
//        movie.setmovie_name("嘻嘻嘻嘻");
//        movie.setMovie_id(1000);
//        movie.setmovie_keyword("没意思,傻蛋");
//
//
//        movieSearchRepository.save(movie);
//    }

}
