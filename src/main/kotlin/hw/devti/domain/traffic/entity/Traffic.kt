package hw.devti.domain.traffic.entity

import hw.devti.global.code.TestType
import hw.devti.global.entity.BaseTimeEntity
import javax.persistence.*

@Entity
class Traffic(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRAFFIC_ID")
    private var id: Long ?= null,

    @Enumerated(EnumType.STRING)
    @Column(name = "test_type")
    private var testType: TestType

): BaseTimeEntity()