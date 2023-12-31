USE [hospital]
GO
/****** Object:  Table [dbo].[doctor]    Script Date: 22-12-2023 18:51:51 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[doctor](
	[id_doctor] [int] IDENTITY(1,1) NOT NULL,
	[id_recaudacion] [int] NOT NULL,
	[id_farmacia] [int] NOT NULL,
	[nombre] [varchar](50) NULL,
	[apellido] [varchar](50) NULL,
	[cargo] [varchar](50) NULL,
	[direccion] [varchar](60) NULL,
	[horas_trabajadas] [int] NULL,
	[horas_extras] [int] NULL,
	[sueldo_base] [int] NULL,
	[afp] [varchar](20) NULL,
	[isapre] [varchar](20) NULL,
 CONSTRAINT [pk_doctor_idDoctor] PRIMARY KEY CLUSTERED 
(
	[id_doctor] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[farmacia]    Script Date: 22-12-2023 18:51:51 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[farmacia](
	[id_farmacia] [int] IDENTITY(1,1) NOT NULL,
	[nombre_producto] [varchar](30) NULL,
	[descripcion_producto] [varchar](100) NULL,
	[proveedor] [varchar](30) NULL,
	[unidades] [int] NULL,
	[precio] [int] NULL,
	[farmaceutico] [varchar](20) NULL,
	[registro_recetas] [varchar](50) NULL,
 CONSTRAINT [pk_farmacia_idFarmacia] PRIMARY KEY CLUSTERED 
(
	[id_farmacia] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[infraestructura]    Script Date: 22-12-2023 18:51:51 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[infraestructura](
	[id_infraestructura] [int] IDENTITY(1,1) NOT NULL,
	[pabellon] [varchar](10) NULL,
	[admision] [varchar](10) NULL,
	[box] [varchar](10) NULL,
	[maternidad] [varchar](10) NULL,
	[uti] [varchar](10) NULL,
	[uci] [varchar](10) NULL,
	[morgue] [varchar](10) NULL,
	[sala_espera] [varchar](10) NULL,
	[sala_desechos] [varchar](10) NULL,
 CONSTRAINT [pk_infraestructura_idInfraestructura] PRIMARY KEY CLUSTERED 
(
	[id_infraestructura] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[paciente]    Script Date: 22-12-2023 18:51:51 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[paciente](
	[id_paciente] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [varchar](30) NOT NULL,
	[edad] [int] NOT NULL,
	[domicilio] [varchar](20) NOT NULL,
	[peso] [int] NOT NULL,
	[altura] [int] NOT NULL,
	[numero_fono] [int] NULL,
	[historial_clinico] [varchar](200) NULL,
	[sintomas] [varchar](100) NOT NULL,
	[prestaciones] [varchar](100) NOT NULL,
 CONSTRAINT [pk_paciente_idPaciente] PRIMARY KEY CLUSTERED 
(
	[id_paciente] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[prevision]    Script Date: 22-12-2023 18:51:51 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[prevision](
	[id_prevision] [int] IDENTITY(1,1) NOT NULL,
	[tipo] [varchar](25) NOT NULL,
 CONSTRAINT [pk_prevision_idPrevision] PRIMARY KEY CLUSTERED 
(
	[id_prevision] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY],
 CONSTRAINT [uniq_prevision_tipo] UNIQUE NONCLUSTERED 
(
	[tipo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[recaudacion]    Script Date: 22-12-2023 18:51:51 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[recaudacion](
	[id_recaudacion] [int] IDENTITY(1,1) NOT NULL,
	[id_paciente] [int] NOT NULL,
	[id_infraestructura] [int] NOT NULL,
	[rut_paciente] [int] NOT NULL,
	[isapre] [varchar](30) NULL,
	[fonasa] [varchar](20) NULL,
	[hora_ingreso] [varchar](9) NULL,
	[especialidad] [varchar](20) NULL,
	[tipo_gravedad] [varchar](50) NULL,
	[unidad_hospitalaria] [varchar](30) NULL,
 CONSTRAINT [pk_recaudacion_idRecaudacion] PRIMARY KEY CLUSTERED 
(
	[id_recaudacion] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tipo_usuario]    Script Date: 22-12-2023 18:51:51 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tipo_usuario](
	[id_tipo_usuario] [int] IDENTITY(1,1) NOT NULL,
	[rol] [varchar](15) NOT NULL,
 CONSTRAINT [pk_tipoUsuario_idTipoUsuario] PRIMARY KEY CLUSTERED 
(
	[id_tipo_usuario] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY],
 CONSTRAINT [uniq_tipoUsuario_rol] UNIQUE NONCLUSTERED 
(
	[rol] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[usuario]    Script Date: 22-12-2023 18:51:51 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[usuario](
	[id_usuario] [int] IDENTITY(1,1) NOT NULL,
	[id_tipo_usuario] [int] NOT NULL,
	[username] [varchar](20) NOT NULL,
	[run] [varchar](10) NOT NULL,
	[nombre] [varchar](20) NOT NULL,
	[apellido] [varchar](20) NOT NULL,
	[direccion] [varchar](50) NOT NULL,
	[telefono] [varchar](20) NULL,
	[correo] [varchar](20) NULL,
	[contrasena] [varchar](100) NOT NULL,
	[conf_contrasena] [varchar](100) NOT NULL,
 CONSTRAINT [pk_usuario_idUsuario] PRIMARY KEY CLUSTERED 
(
	[id_usuario] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY],
 CONSTRAINT [uniq_usuario_username] UNIQUE NONCLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[doctor]  WITH CHECK ADD  CONSTRAINT [fk_farmacia_idFarmacia] FOREIGN KEY([id_farmacia])
REFERENCES [dbo].[farmacia] ([id_farmacia])
GO
ALTER TABLE [dbo].[doctor] CHECK CONSTRAINT [fk_farmacia_idFarmacia]
GO
ALTER TABLE [dbo].[doctor]  WITH CHECK ADD  CONSTRAINT [fk_recaudacion_idRecaudacion] FOREIGN KEY([id_recaudacion])
REFERENCES [dbo].[recaudacion] ([id_recaudacion])
GO
ALTER TABLE [dbo].[doctor] CHECK CONSTRAINT [fk_recaudacion_idRecaudacion]
GO
ALTER TABLE [dbo].[recaudacion]  WITH CHECK ADD  CONSTRAINT [fk_infraestructura_idInfraestructura] FOREIGN KEY([id_infraestructura])
REFERENCES [dbo].[infraestructura] ([id_infraestructura])
GO
ALTER TABLE [dbo].[recaudacion] CHECK CONSTRAINT [fk_infraestructura_idInfraestructura]
GO
ALTER TABLE [dbo].[recaudacion]  WITH CHECK ADD  CONSTRAINT [fk_paciente_idPaciente] FOREIGN KEY([id_paciente])
REFERENCES [dbo].[paciente] ([id_paciente])
GO
ALTER TABLE [dbo].[recaudacion] CHECK CONSTRAINT [fk_paciente_idPaciente]
GO
ALTER TABLE [dbo].[usuario]  WITH CHECK ADD  CONSTRAINT [fk_tipoUsuario_idTipoUsuario] FOREIGN KEY([id_tipo_usuario])
REFERENCES [dbo].[tipo_usuario] ([id_tipo_usuario])
GO
ALTER TABLE [dbo].[usuario] CHECK CONSTRAINT [fk_tipoUsuario_idTipoUsuario]
GO
