package com.lt.springdemo.mapper;

import com.lt.springdemo.model.Comment;
import com.lt.springdemo.model.CommentExample;
import com.lt.springdemo.model.Question;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CommentExtMapper {
    int incCommentCount(Comment record);
}