/**
 * Created By Sunil Verma
 * Date: 08/12/22
 * Time: 11:28 AM
 * Project Name: practice
 */

package com.practice.repo;

import com.practice.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepo extends JpaRepository<AppUser, String> {
}
