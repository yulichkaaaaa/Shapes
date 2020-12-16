package com.yuliana.shapes.model.repository.impl;

import com.yuliana.shapes.model.entity.Ellipse;
import com.yuliana.shapes.model.repository.Repository;
import com.yuliana.shapes.model.repository.specification.Specification;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EllipseRepository implements Repository<Ellipse> {

    public final static EllipseRepository repository = new EllipseRepository();
    private List<Ellipse> ellipses;

    private EllipseRepository() {
        ellipses = new ArrayList<>();
    }

    @Override
    public void add(Ellipse ellipse) {
        ellipses.add(ellipse);
    }

    @Override
    public void remove(Ellipse ellipse) {
        ellipses.remove(ellipse);
    }

    @Override
    public Ellipse get(int index) {
        return ellipses.get(index);
    }

    @Override
    public List<Ellipse> sort(Comparator<? super Ellipse> comparator) {
        List<Ellipse> result = new ArrayList<>(ellipses);
        result.sort(comparator);
        return result;
    }

    @Override
    public List<Ellipse> query(Specification<Ellipse> specification) {
        List<Ellipse> result = ellipses.stream().filter(o -> specification.specify(o)).collect(Collectors.toList());
        return result;
    }
}
