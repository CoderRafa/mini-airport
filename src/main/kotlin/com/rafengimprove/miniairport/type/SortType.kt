package com.rafengimprove.miniairport.type

import org.springframework.data.domain.Sort

enum class SortType {
    ASC {
        override fun toSort(fieldName: String): Sort {
            return Sort.by(fieldName).ascending()
        }
    },

    DESC {
        override fun toSort(fieldName: String): Sort {
            return Sort.by(fieldName).descending()
        }
    };
    abstract fun toSort(fieldName: String): Sort
}