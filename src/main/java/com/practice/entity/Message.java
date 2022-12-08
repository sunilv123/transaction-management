/**
 * Created By Sunil Verma
 * Date: 08/12/22
 * Time: 11:28 AM
 * Project Name: practice
 */

package com.practice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "message")
@Setter
@Getter
@NoArgsConstructor
public class Message extends BaseEntity{

    private String message;

}
