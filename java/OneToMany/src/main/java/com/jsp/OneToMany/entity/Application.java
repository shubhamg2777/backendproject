package com.jsp.OneToMany.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import com.jsp.OneToMany.constant.EntityConstant;

@Entity
@Table(name = EntityConstant.APPLICATION_INFO)
public class Application implements Serializable {
		@Id
		@GenericGenerator(name = "auto", strategy = "increment")
		@GeneratedValue(generator = "auto")
		@Column(name = "id")
		private int id;
		@Column(name = "name")
		private String name;
		@Column(name = "version")
		private String version;
		@Column(name = "type")
		private String type;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

}
