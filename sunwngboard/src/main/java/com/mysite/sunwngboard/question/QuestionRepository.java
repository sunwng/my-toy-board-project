package com.mysite.sunwngboard.question;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String subject);
    List<Question> findBySubjectLike(String subject);

    Page<Question> findAll(Pageable pageable);

    @Query("select "
            + "distinct q "
            + "from Question q "
            + "left outer join Answer a on a.question=q "
            + "left outer join SiteUser u1 on q.author=u1 "
            + "where "
            + "   q.subject like %:kw% "
            + "   or u1.username like %:kw% "
            + "   or q.content like %:kw% "
            + "   or a.content like %:kw% ")
    Page<Question> findAllByKeyword(@Param("kw") String kw, Pageable pageable);
}
