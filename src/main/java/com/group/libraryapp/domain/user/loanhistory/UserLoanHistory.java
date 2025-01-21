package com.group.libraryapp.domain.user.loanhistory;

import com.group.libraryapp.domain.user.User;
import jakarta.persistence.*;

@Entity
public class UserLoanHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    //private Long userId;
    @ManyToOne      //UserLoanHistory입장에서는 대출 기록은 여러개,  대출기록을 소유하고 있는 소유자는 한명
    private User user;

    private String bookName;

    private boolean isReturn;

    public UserLoanHistory(User user, String bookName) {
        this.user = user;
        this.bookName = bookName;
        this.isReturn = false;
    }

    protected UserLoanHistory() {}

    public void doReturn(){
        this.isReturn = true;
    }
}
