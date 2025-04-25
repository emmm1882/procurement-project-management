-- 项目主表 t_project
CREATE TABLE t_project (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键ID',
    project_code VARCHAR(64) NOT NULL COMMENT '项目编号',
    project_name VARCHAR(128) NOT NULL COMMENT '项目名称',
    project_type VARCHAR(64) COMMENT '项目类型',
    project_status VARCHAR(32) COMMENT '项目状态',
    total_amount DECIMAL(18,2) COMMENT '项目总金额',
    description VARCHAR(512) COMMENT '项目描述',
    department VARCHAR(128) COMMENT '所属部门',
    manager VARCHAR(64) COMMENT '项目负责人',
    start_date DATE COMMENT '开始日期',
    end_date DATE COMMENT '结束日期',
    create_time DATETIME COMMENT '创建时间',
    create_by VARCHAR(64) COMMENT '创建人',
    update_time DATETIME COMMENT '更新时间',
    update_by VARCHAR(64) COMMENT '更新人'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='采购项目主表';

-- 项目明细表 t_project_detail
CREATE TABLE t_project_detail (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键ID',
    project_id BIGINT NOT NULL COMMENT '关联项目ID',
    item_code VARCHAR(64) COMMENT '物品编号',
    item_name VARCHAR(128) COMMENT '物品名称',
    item_type VARCHAR(64) COMMENT '物品类型',
    specification VARCHAR(128) COMMENT '规格型号',
    unit VARCHAR(32) COMMENT '单位',
    quantity INT COMMENT '数量',
    unit_price DECIMAL(18,2) COMMENT '单价',
    total_price DECIMAL(18,2) COMMENT '总价',
    supplier VARCHAR(128) COMMENT '供应商',
    remark VARCHAR(256) COMMENT '备注',
    create_time DATETIME COMMENT '创建时间',
    create_by VARCHAR(64) COMMENT '创建人',
    update_time DATETIME COMMENT '更新时间',
    update_by VARCHAR(64) COMMENT '更新人',
    CONSTRAINT fk_project_id FOREIGN KEY (project_id) REFERENCES t_project(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='采购项目明细表';