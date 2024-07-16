package org.example.service;

import org.example.entity.BorrowDetail;
import org.springframework.stereotype.Service;

@Service
public interface BorrowService {
    BorrowDetail getUserBorrowDetailByUid(int uid);
}
