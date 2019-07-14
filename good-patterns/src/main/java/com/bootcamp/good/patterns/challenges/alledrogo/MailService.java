package com.bootcamp.good.patterns.challenges.alledrogo;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Dear, " + user.getRealName() + " your order is beeing processed.");
    }
}