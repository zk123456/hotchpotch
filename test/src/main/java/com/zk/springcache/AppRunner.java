package com.zk.springcache;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author Zhangk
 * @Date 15:03 2018/11/12
 * @Description
 */
@Configuration
@Component
public class AppRunner implements CommandLineRunner {
    private final BookRep bookRep;

    public AppRunner(BookRep bookRep) {
        this.bookRep = bookRep;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println((".... Fetching books"));
        System.out.println(bookRep.getByIsbn("isbn-1234"));
        System.out.println(bookRep.getByIsbn("isbn-4567"));
        System.out.println(bookRep.getByIsbn("isbn-1234"));
        System.out.println(bookRep.getByIsbn("isbn-4567"));
        System.out.println(bookRep.getByIsbn("isbn-1234"));
        System.out.println(bookRep.getByIsbn("isbn-1234"));
    }
}
