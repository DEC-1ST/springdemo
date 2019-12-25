create table notification
(
	id bigint auto_increment,
	notifier bigint not null comment '发出者',
	receiver bigint not null comment '接收者',
	type int not null comment '判断消息类型',
	outerId bigint not null comment '消息id',
	gmt_create int not null,
	status int default 0 not null comment '0为未读 1为已读',
	constraint notification_pk
		primary key (id)
);