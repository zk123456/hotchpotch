package com.zk.springcache;

import org.springframework.stereotype.Component;

/**
 * @Author Zhangk
 * @Date 14:34 2018/11/12
 * @Description
 */
@Component
public class BookRepImpl implements BookRep {
    @Override
    public Book getByIsbn(String isbn) {
        simulateSlowService();
        return new Book(isbn, "Some book");
    }

    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
