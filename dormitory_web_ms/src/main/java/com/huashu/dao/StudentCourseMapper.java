package com.huashu.dao;

import com.huashu.pojo.Signinfo;
import com.huashu.pojo.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Auther: wyan
 * @Date: 2019/4/26 00:31
 * @Description:
 */
public interface StudentCourseMapper extends JpaRepository<StudentCourse,String>,JpaSpecificationExecutor<StudentCourse> {

}