/**
 * Created By Sunil Verma
 * Date: 08/12/22
 * Time: 11:25 AM
 * Project Name: practice
 */

package com.practice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "app_user")
public class AppUser extends BaseEntity {

    private String name;

    private String email;

}
