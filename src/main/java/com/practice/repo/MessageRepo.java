/**
 * Created By Sunil Verma
 * Date: 08/12/22
 * Time: 11:29 AM
 * Project Name: practice
 */

package com.practice.repo;

import com.practice.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, String> {
}
