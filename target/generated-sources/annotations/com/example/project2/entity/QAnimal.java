package com.example.project2.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAnimal is a Querydsl query type for Animal
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAnimal extends EntityPathBase<Animal> {

    private static final long serialVersionUID = 110996643L;

    public static final QAnimal animal = new QAnimal("animal");

    public final StringPath age = createString("age");

    public final ListPath<AnimalHeart, QAnimalHeart> animalHeart = this.<AnimalHeart, QAnimalHeart>createList("animalHeart", AnimalHeart.class, QAnimalHeart.class, PathInits.DIRECT2);

    public final StringPath careAddr = createString("careAddr");

    public final StringPath careNm = createString("careNm");

    public final StringPath careTel = createString("careTel");

    public final StringPath colorCd = createString("colorCd");

    public final StringPath filename = createString("filename");

    public final StringPath happenDt = createString("happenDt");

    public final StringPath kindCd = createString("kindCd");

    public final StringPath neuterYn = createString("neuterYn");

    public final StringPath noticeEdt = createString("noticeEdt");

    public final StringPath noticeNo = createString("noticeNo");

    public final NumberPath<Integer> noticeSdt = createNumber("noticeSdt", Integer.class);

    public final StringPath officetel = createString("officetel");

    public final StringPath orgNm = createString("orgNm");

    public final StringPath orgNmc = createString("orgNmc");

    public final StringPath popfile = createString("popfile");

    public final StringPath procssState = createString("procssState");

    public final StringPath sexCd = createString("sexCd");

    public final NumberPath<Long> sId = createNumber("sId", Long.class);

    public final StringPath specialMark = createString("specialMark");

    public final StringPath weight = createString("weight");

    public QAnimal(String variable) {
        super(Animal.class, forVariable(variable));
    }

    public QAnimal(Path<? extends Animal> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAnimal(PathMetadata metadata) {
        super(Animal.class, metadata);
    }

}

