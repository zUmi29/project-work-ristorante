package Ristorante.projectworkristorante.service;

import jakarta.servlet.http.HttpSession;

public interface AdminService {
    boolean adminLogin(String username, String password, HttpSession session);
}
